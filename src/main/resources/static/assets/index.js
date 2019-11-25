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
      console.log(key, keyPath);
    }
  }
})