public class WeekSix {
    public boolean canCross(int[] stones) {
        return can_Cross(stones, 0, 0);
    }
    public boolean can_Cross(int[] stones, int ind, int jumpsize) {
        for (int i = ind + 1; i < stones.length; i++) {
            int gap = stones[i] - stones[ind];
            if (gap >= jumpsize - 1 && gap <= jumpsize + 1) {
                if (can_Cross(stones, i, gap)) {
                    return true;
                }
            }
        }
        return ind == stones.length - 1;
    }


    public int minPathSum(int[][] grid) {

        for (int row=1; row<grid.length; row++) {
            grid[row][0] = grid[row][0] + grid[row-1][0];
        }

        for (int col=1; col<grid[0].length; col++) {
            grid[0][col] = grid[0][col] + grid[0][col-1];
        }

        for (int row=1; row<grid.length; row++) {
            for (int col=1; col<grid[row].length; col++) {
                grid[row][col] = grid[row][col] + Math.min(
                        grid[row-1][col], grid[row][col-1]
                );
            }
        }

        int[] lastRow = grid[grid.length-1];
        return lastRow[lastRow.length-1];
    }
}
