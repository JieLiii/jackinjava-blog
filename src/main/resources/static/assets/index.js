new Vue({
  el: '#app',
  created: function () {
    this.appStyle.height = Math.max(document.body.scrollHeight,document.documentElement.scrollHeight)-74  + 'px';
    //this.iframeHeight = Math.max(document.body.scrollHeight,document.documentElement.scrollHeight) - 100;
    if(this.activeIndex === '1'){
      this.activeSrc = ctxPath + '/nav/homepage/index.html';
    }
  },
  data: function() {
    return {
      activeIndex: '1',
      activeSrc: '',
      appStyle: {
        height: '0'
      },
      iframeHeight: '100%'
    };
  },
  methods: {
    handleSelect: function(key, keyPath) {
      this.activeSrc = '';
      base.message.success(key)
      if(key === '1'){
        this.activeSrc = ctxPath + '/nav/homepage/index.html';
      } else if(key === '3'){
        this.activeSrc = ctxPath + '/nav/article/index.html';
      }
    }
  }
})