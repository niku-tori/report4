package jp.ac.uryukyu.ie.e205706;

/** 
 *戦士クラス
 */
public class Warrior extends Hero{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    /**
     * 攻撃するメソッド
     * attackの150%を算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent　攻撃対象
     */
    public void attackWithWeponSkill(LivingThing opponent){
        if(!dead){
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}