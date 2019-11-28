new Vue({
  el: '#app',
  created: function () {

  },
  mounted: function () {
    var iframe = parent.document.getElementById('menu-iframe');
    var mainHeight = iframe.offsetHeight;
    var mainWidth = iframe.offsetWidth;
    this.contentStyle.height = mainHeight-16 + 'px';
    this.editor.height = mainHeight-53 + 'px';
    this.editorStyle.width = mainWidth - 520 + 'px';

    var E = window.wangEditor;
    var editor = new E(this.$refs.toolbar,this.$refs.editor);
    editor.customConfig.debug = true;
    editor.create();
    editor.txt.html('<p>hello</p>');
    this.E = editor;
  },
  data: function () {
    return {
      E: {},
      isCollapse: true,
      contentStyle: {
        height: '0'
      },
      editorStyle: {
        width: '0'
      },
      editor: {
        height: '0'
      }
    }
  },
  methods: {
    save: function () {
      alert(this.E.txt.text());
      alert(this.E.txt.html());
    },
    handleOpen: function(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose: function(key, keyPath) {
      console.log(key, keyPath);
    },
    goBack: function () {
      window.location.href = ctxPath + '/nav/article/index.html';
    }
  }
})