package jp.ac.uryukyu.ie.e205706;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * Warriorクラスからオブジェクトを生成し、attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する。
     */
    @Test
    void attackWithWeponSkillTest() {
        int defaultWarriorAttack = 50;
        int previousEnemyHP;
        Warrior demoWarrior = new Warrior("デモ戦士", 200, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 250, 20);
        for(int i = 0; i < 3; i++){
            previousEnemyHP = slime.hitPoint;
            demoWarrior.attackWithWeponSkill(slime);
            slime.attack(demoWarrior);
            assertEquals(previousEnemyHP - slime.hitPoint, (int)(1.5 * defaultWarriorAttack));
        }
    }
}