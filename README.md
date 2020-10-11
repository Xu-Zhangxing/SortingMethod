# sortingMethod

七种排序方法

·四种基本排序方法：冒泡排序、选择排序、插入排序、希尔排序

--冒泡排序和选择排序为固定的O(n^2)时间复杂度
--插入排序在应对小规模及基本有序的数组时有较好的效率，而在面对大规模的无序数组时效率很差，为了改善这种情况产生了希尔排序
--希尔排序算法是插入排序的改进算法，能够在面对大规模的无序数组时仍然有较好的效率，因而是四种基本排序算法的首要选择
·归并排序和快速排序都需要用到递归的方法，其中归并排序需要用到额外的内存空间，前者效率为O(nlogn)，后者最好情况下为O(nlogn)，最坏情况下为O(n^2)
·堆排序是以数组模拟二叉树的一种排序算法，有大分堆和小分堆两种方法，前者得到由小到大的数组，后者得到由大到小的数组，效率为O(nlogn)
