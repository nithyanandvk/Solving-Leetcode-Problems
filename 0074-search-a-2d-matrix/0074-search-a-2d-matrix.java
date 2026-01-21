class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int left = 0, right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (midValue == target) return true;
            if (midValue < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
