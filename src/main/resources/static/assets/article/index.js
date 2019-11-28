new Vue({
  el: '#app',
  created: function () {
  },
  data: function () {
    return {}
  },
  methods: {
    newPage: function () {
      window.location.href = ctxPath + '/nav/homepage/index.html';
    },
    write: function () {
      window.location.href = ctxPath + '/nav/article/write.html';
    }
  }
})