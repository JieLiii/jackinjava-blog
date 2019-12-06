var ELEMENT = Vue.prototype;

var axiosInst = axios.create({
  timeout: 15000
  // withCredentials: true   是否跨站点访问
});

var base = {
  loading: function loading(config) {
    return ELEMENT.$loading(_.assign({}, {
      lock: true,
      text: 'Loading',
      spinner: 'el-icon-loading',
      background: 'rgb(0,0,0,0.2)'
    }, config));
  },
  message: {
    success: function (message) {
      this.alert(message, {type: 'success'});
    },
    warning: function (message) {
      this.alert(message, {type: 'warning'});
    },
    error: function (message) {
      this.alert(message, {type: 'error'});
    },
    alert: function (message, config) {
      var defConfig = {
        message: message,
        type: 'info',
        showClose: false,
        duration: 3000
      };
      var options = _.assign({}, defConfig, config);
      ELEMENT.$message(options);
    }
  },
  notify: {}
};

base.http = {
  defaultConfig: {
    ui: {
      showLoading: true,
      showError: true
    }
  },
  request: function request(config) {
    var options = _.assign({}, this.defaultConfig, config);

    if (options.ui.showLoading) {
      //showFullScreenLoading();
    }

    return axiosInst.request(config)
    //   .then(function (response) {
    //   //tryHideFullScreenLoading();
    //   var result = response.data || {};
    //
    //   if (!result.successed) {
    //     if (options.ui.showError) {
    //       base.message.error(result.msg);
    //     }
    //
    //     return Promise.reject(result.msg);
    //   }
    //
    //   return result;
    // }).catch(function (e) {
    //   //tryHideFullScreenLoading();
    //
    //   if (e && e.message) {
    //     e = e.message;
    //
    //     if (options.ui.showError) {
    //       base.message.error(e);
    //     }
    //   }
    //   return Promise.reject(e);
    // });
  },
  get: function get(url, params, config) {
    return this.request(_.assign({}, config, {
      method: 'get',
      url: url,
      params: params
    }));
  },
  post: function post(url, data, config) {
    return this.request(_.assign({}, config, {
      method: 'post',
      url: url,
      data: data
    }));
  }
};
var needLoadingRequestCount = 0, loading;

function showFullScreenLoading() {
  if (needLoadingRequestCount === 0) {
    loading = base.loading();
  }
  needLoadingRequestCount++;
}

function tryHideFullScreenLoading() {
  if (needLoadingRequestCount <= 0) {
    return;
  }
  needLoadingRequestCount--;
  if (needLoadingRequestCount === 0) {
    _.debounce(tryCloseLoading, 500)();
  }
}

var tryCloseLoading = function tryCloseLoading() {
  if (needLoadingRequestCount === 0) {
    loading.close();
  }
};

base.mainHeight = {
  data: function data() {
    return {
      mainHeight: 0
    }
  },
  mounted: function mounted() {
    this.getMainHeight();
  },
  methods: {
    getMainHeight: function getMainHeight() {
      var content = document.querySelector('.main-app');
      this.mainHeight = content.clientHeight - 61;
    }
  }
};


Vue.mixin({
  methods: {
    $get: function $get(url, params, config) {
      return base.http.get(url, params, config);
    },
    $post: function $post(url, params, config) {
      return base.http.post(url, params, config);
    }
  }
});