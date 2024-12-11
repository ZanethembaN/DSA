package portfolio;

public class NumberOfIslands {

    /**
     * Counts the number of islands in the given grid.
     *
     * @param grid 2D grid of '1's (land) and '0's (water)
     * @return the number of islands
     */
    public int numIsland(char[][] grid){

        // Handle edge case of null or empty grid
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int count = 0;

        // Traverse the grid
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){

                if (grid[i][j] == '1'){
                    count ++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    /**
     * Marks all parts of the island as visited using DFS.
     *
     * @param grid 2D grid
     * @param i    current row index
     * @param j    current column index
     */
    private void dfs(char[][] grid, int i, int j){

        // Boundary and water checks
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;

        // Mark the current cell as visited
        grid[i][j] = '0';

        // Explore neighbors
        dfs(grid, i + 1, j); // Down
        dfs(grid, i - 1, j); // Up
        dfs(grid, i, j + 1); // Right
        dfs(grid, i, j - 1); // Left
    }
}
