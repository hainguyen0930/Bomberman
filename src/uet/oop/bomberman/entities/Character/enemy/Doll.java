package uet.oop.bomberman.entities.character.enemy;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.character.enemy.enemyMove.MoveOneal;
import uet.oop.bomberman.graphics.Sprite;

public class Doll extends Enemy {

    public Doll(int x, int y, Board board) {
        super(x, y, board, Sprite.doll_dead, 0.6 );

        _sprite = Sprite.doll_right1;
        _Move = new MoveOneal(_board.getBomber(), this);
        _direction = _Move.calculateDirection();
    }
    /*
	|--------------------------------------------------------------------------
	| Mob Sprite
	|--------------------------------------------------------------------------
	 */
    @Override
    protected void chooseSprite() {
        switch(_direction) {
            case 0:
            case 1:
                if(_moving)
                    _sprite = Sprite.movingSprite(Sprite.doll_right1, Sprite.doll_right2, Sprite.doll_right3, _animate, 60);
                else
                    _sprite = Sprite.doll_left1;
                break;
            case 2:
            case 3:
                if(_moving)
                    _sprite = Sprite.movingSprite(Sprite.doll_left1, Sprite.doll_left2, Sprite.doll_left3, _animate, 60);
                else
                    _sprite = Sprite.doll_left1;
                break;
        }
    }
}
