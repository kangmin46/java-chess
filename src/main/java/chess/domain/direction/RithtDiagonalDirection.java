package chess.domain.direction;

import chess.domain.Position;

public class RithtDiagonalDirection implements Direction{
    @Override
    public Position simulateUnitMove(Position position, boolean isReverseDirection) {
        if(isReverseDirection){
            return position.movePosition(-1,-1);
        }
        return position.movePosition(1,1);
    }

    @Override
    public int matchMoveCount(int rowDifference, int columnDifference) {
        return rowDifference;
    }
}
