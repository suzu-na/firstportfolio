/* 更新日の取得 */
const last = new Date(document.lastModified);
const year = last.getFullYear();
const month = last.getMonth() + 1;
const date = last.getDate();
/* 日付を書き換える */
/*const target = document.getElementById('modify');
target.textContent = year + '-' + month + '-' + date;
setInterval(function() {
    document.getElementById("d2").innerHTML = new Date().toLocaleString();
  }, 1000);
  /*動く時計を表示する場合はHTMLに書くと下記になる
  <div id="d2">&nbsp;</div>
<script>
setInterval(function() {
  document.getElementById("d2").innerHTML = new Date().toLocaleString();
}, 1000);
</script>*/
