from random import seed
from random import randint


class QuickSort:
    def __init__(self, arr):
        self.arr = arr
        self.left = 0
        self.right = len(arr) - 1

        self.quick_sort(self.left, self.right)

    def partition(self, pivot):
        left_ptr = self.left
        right_ptr = self.right
        while True:
            #while self.arr[++left_ptr] < pivot:
            #    pass
            #while right_ptr > 0 and self.arr[--right_ptr] > pivot:
            #    pass
            if left_ptr >= right_ptr:
                break
            else:
                # swap left pointer and right pointer
                temp = left_ptr
                left_ptr = right_ptr
                right_ptr = temp

        # swap left pointer and right
        temp = self.arr[left_ptr]
        self.arr[left_ptr] = self.arr[self.right]
        self.arr[self.right] = temp

        return left_ptr

    def quick_sort(self, l, r):
        self.left = l
        self.right = r
        if(self.right - self.left) <= 0:
            return
        else:
            pivot = self.arr[self.right]
            partition = self.partition(pivot)
            self.quick_sort(self.left, partition - 1)
            self.quick_sort(partition + 1, self.right)

        return self.arr


# test of speed
seed(1)
arr_length = 10

testArr = []
while len(testArr) < arr_length:
    testArr.append(randint(0, 500))

print(testArr)
sortedArr = QuickSort(testArr)
print(sortedArr)

