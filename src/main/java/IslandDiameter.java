public class IslandDiameter {

        public static int islandDiameter(int[][] grid) {
            int maxDiameter = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        maxDiameter = Math.max(maxDiameter, dfs(grid, i, j));
                    }
                }
            }

            return maxDiameter;
        }

        private static int dfs(int[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
                return 0;
            }

            grid[i][j] = 0; // Mark the cell as visited

            int left = dfs(grid, i, j - 1);
            int right = dfs(grid, i, j + 1);
            int up = dfs(grid, i - 1, j);
            int down = dfs(grid, i + 1, j);

            // Calculate the diameter from the current cell
            int diameterFromCurrentCell = 1 + left + right + up + down;

            return diameterFromCurrentCell;
        }

        public static void main(String[] args) {
            int[][] grid = {
                    {1, 0, 1, 0, 1},
                    {1, 0, 1, 0, 1},
                    {1, 1, 1, 0, 0},
                    {0, 0, 0, 1, 1},
                    {1, 1, 1, 1, 1}
            };

            int result = islandDiameter(grid);
            System.out.println("The diameter of the island is: " + result);
        }
    }


