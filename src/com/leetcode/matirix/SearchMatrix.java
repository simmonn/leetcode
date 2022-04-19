package com.leetcode.matirix;

/**
 * https://tva1.sinaimg.cn/large/e6c9d24ely1h1bp7lwgdcj20b60b63yu.jpg
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
 * 输出：true
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xmlwi1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @author simmon
 * @since 2022/4/16
 */
public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        //从左下角搜索
        int row = matrix.length-1;
        int col = 0;
        while (row >= 0 && col <= matrix[0].length - 1) {
            // 等于的话返回true
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                //小于 行号上移
                row--;
            } else {
                //大于 列后移
                col++;
            }
        }
        return false;

    }
}
