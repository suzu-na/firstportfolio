import java.util.ArrayList;
import java.utiil.Array;
import java.util.List
//ババ抜きの場合マークと数字、記号を数字に変換する機能をつけて
//カードの総数定義、カードの引き乱数を定義、同じ数字を手から捨てる、相手にひかせる乱数を定義、
//カード情報
class Card 
{
    int suit;// 色（0:白/1:赤/2:青/3:黒/4:茶/5:紫)
    int suit1;// 指定国力
    int suit2;// 合計国力
    int suit3;// コスト
}

//山札クラス

pudlic class deck
{
    //定数定期
    final int TOTAL_CARD = 50;//カードの総数

    //メンバー変数定義
    //カードリスト（山札）0~51の要素を入れ、それぞれマークと数字を割り当てる
    //0~12：スペードA~K/13~25:ハートA~K/26~38:ダイヤA~K/39~51:クラブ
    private List card_list;

    //次に取り出すカード番号(1枚引くごとに1加算する)
    private int card_index = 0;

}