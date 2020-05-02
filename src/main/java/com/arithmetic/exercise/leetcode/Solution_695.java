package com.arithmetic.exercise.leetcode;

/**
 * @program: leetCode-exercise
 * @description: 695. 岛屿的最大面积
 * @author: liuguohu
 * @create: 2020-05-02 20:15
 **/

public class Solution_695 {

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null)
            return 0;

        int res = 0, len_y = grid.length, len_x = grid[0].length, temp = 0;

        for (int y = 0; y < len_y; y++) {
            for (int x = 0; x < len_x; x++) {
                temp = dfs(grid, y, x, len_y, len_x);
                res = res < temp ? temp : res;
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int y, int x, int len_y, int len_x) {
        // 判断边界
        if (0 <= y && y < len_y && 0 <= x && x < len_x && grid[y][x] == 1) {
            grid[y][x] = 0;
            return dfs(grid, y + 1, x, len_y, len_x) + dfs(grid, y - 1, x, len_y, len_x) + dfs(grid, y, x + 1, len_y, len_x) + dfs(grid, y, x - 1, len_y, len_x) + 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution_695 test = new Solution_695();
        int[][] data = {{1}};
//        System.out.println(test.maxAreaOfIsland(MapData.getData()));

        System.out.println(test.maxAreaOfIsland(data));
    }
}
