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
    editor.customConfig.menus = [
      'head',  // 标题
      'bold',  // 粗体
      // 'fontSize',  // 字号
      'fontName',  // 字体
      'italic',  // 斜体
      // 'underline',  // 下划线
      'strikeThrough',  // 删除线
      'foreColor',  // 文字颜色
      // 'backColor',  // 背景颜色
      'link',  // 插入链接
      // 'list',  // 列表
      'justify',  // 对齐方式
      'quote',  // 引用
      'emoticon',  // 表情
      'image',  // 插入图片
      // 'table',  // 表格
      // 'video',  // 插入视频
      // 'code',  // 插入代码
      'undo',  // 撤销
      'redo'  // 重复
    ]
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
      },
      saveUrl: ctxPath + '/article/save'
    }
  },
  methods: {
    save: function () {

      var me = this;
      var body = {
        content: me.E.txt.text(),
        contentHtml: me.E.txt.html()
      };
      me.$post(me.saveUrl,body).then(function () {
        base.message.success("保存成功");
      })

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