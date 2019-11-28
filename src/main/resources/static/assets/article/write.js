new Vue({
  el: '#app',
  created: function () {
  },
  mounted: function () {
    var E = window.wangEditor;
    var editor = new E(this.$refs.editor);
    editor.customConfig.debug = true;
    editor.create();
    editor.txt.html('<p>hello</p>');
    this.E = editor;
  },
  data: function () {
    return {
      E: {}
    }
  },
  methods: {
    getContent: function () {
      alert(this.E.txt.text());
      alert(this.E.txt.html());
    }
  }
})