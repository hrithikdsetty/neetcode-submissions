class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){

                Character temp = board[i][j];

                if(temp=='.') continue;

                if(rows[i].contains(temp)) return false;
                if(columns[j].contains(temp)) return false;

                int box = (i/3)*3 + (j/3);
                if(boxes[box].contains(temp)) return false;

                rows[i].add(temp);
                columns[j].add(temp);
                boxes[box].add(temp);
            }
        }

        return true;
        
    }
}
