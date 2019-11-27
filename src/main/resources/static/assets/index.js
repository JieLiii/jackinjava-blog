new Vue({
  el: '#app',
  created: function () {
  },
  data: function() {
    return {
      activeIndex: '1',
      activeIndex2: '1'
    };
  },
  methods: {
    handleSelect: function(key, keyPath) {
      base.message.success("这是错误提示")

    }
  }
})