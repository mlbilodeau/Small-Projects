from random import seed
from random import randint

"""
Implement Bubble Sort
Worst-Case time Complexity of O(N**2)
@:param arr an array to be sorted
@:returns arr an array that has been sorted using bubble sort
"""


def bubble_sort(arr):
    for j in range(0, len(arr)-1):
        swapped = False
        for i in range(0, len(arr)-1):
            if arr[i] > arr[i+1]:
                # SWAP
                temp = arr[i+1]
                arr[i+1] = arr[i]
                arr[i] = temp
                swapped = True

        if not swapped:
            break

    return arr


seed(1)
arr_length = 500
testArr = []
while len(testArr) < 500:
    testArr.append(randint(0, 5000))

testArr = [21, 3, 44, 99, 43, 2, 2, 34]

print(testArr)
sortedArr = bubble_sort(testArr)
print(sortedArr)
