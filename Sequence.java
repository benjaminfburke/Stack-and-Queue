
public class Sequence {
    private Grid grid;
    private Stack<Loc> path;//stores the sequence path
    private int size;
    private boolean [][] check;
    private int [][] c;


    //constructor: create a new Sequence for the 
    //specified grid
    public Sequence(Grid grid) {
	this.grid = grid;
	this.path = new Stack<Loc>();
	this.size = grid.size();
	this.check = new boolean[size][size];

    }

    //resets the grid and the path
    public void reset(Grid grid) {
	this.grid = grid;
	this.path = new Stack<Loc>();
    }

    //(i, j)  is the starting location
    //val is the value that should end the sequence
    public void getSeq(int i, int j, int val) throws EmptyStackException {
        //To be implemented

        //attempt that works for most tests but has an error
        /*if (!check[i][j]) {
            path.push(grid.getLoc(i, j));
        }

        check[i][j] = true;

        if (grid.getLoc(i, j).val == val) {
            return;
        }

        // recur top cell if its value is +1 of value at (i, j)
        if (i > 0 && grid.getLoc(i-1, j).val - grid.getLoc(i, j).val == 1 && !check[i - 1][j]) {
            getSeq(i - 1, j, val);
        }

        // recur right cell if its value is +1 of value at (i, j)
        else if (j + 1 < size && grid.getLoc(i,j + 1).val - grid.getLoc(i,j).val == 1 && !check[i][j + 1]) {
            getSeq(i, j + 1, val);
        }

        // recur bottom cell if its value is +1 of value at (i, j)
        else if (i + 1 < size && grid.getLoc(i + 1,j).val - grid.getLoc(i, j).val == 1 && !check[i + 1][j]) {
            getSeq(i + 1, j, val);
        }

        // recur left cell if its value is +1 of value at (i, j)
        else if (j > 0 && grid.getLoc(i, j - 1).val - grid.getLoc(i, j).val == 1 && !check[i][j - 1]) {
            getSeq(i, j - 1, val);
        }
        else {
            path.pop();
            if (path.isEmpty()) {
                return;
            }
            else {
                getSeq(path.peek().col, path.peek().row, val);
            }
        }

         */

    }

    //return a String representation of the sequence
    //starting at the starting location and listing
    //all locations in the sequence in order
    public String toString() {
	    //To be implemented
        return "";
    }
}