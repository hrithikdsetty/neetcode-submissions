class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> [] rows = new HashSet[9];
        Set<Character> [] cols = new HashSet[9];
        Set<Character> [] boxes = new HashSet[9];

        for(int i=0; i<9; i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                char temp = board[i][j];

                if(temp=='.') continue;

                if(rows[i].contains(temp)) return false;
                if(cols[j].contains(temp)) return false;

                int box = ((i/3)*3) + (j/3);

                if(boxes[box].contains(temp)) return false;

                rows[i].add(temp);
                cols[j].add(temp);
                boxes[box].add(temp);
                
            }
        }

        return true;
    }
}
