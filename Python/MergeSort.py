from random import seed
from random import randint

"""
Implementation of Merge Sort
@:param arr
@:returns arr sorted using merge sort
"""


def merge_sort(arr):
    # base case: if only one value in array then we're already sorted
    if len(arr) == 1:
        return arr

    # initial divide of the original array
    l1 = arr[0:int(len(arr)/2)]
    l2 = arr[int(len(arr)/2):len(arr)]

    # recursively divide the array into mode manageable pieces
    l1 = merge_sort(l1)
    l2 = merge_sort(l2)

    # merge all pieces together into sorted array
    return merge(l1, l2)


def merge(a, b):
    c = []
    while len(a) > 0 and len(b) > 0:
        # compare the first element of each array
        if a[0] > b[0]:
            c.append(b[0])
            # remove b[0] from b
            b.pop(0)
        else:
            c.append(a[0])
            # remove a[0] from a
            a.pop(0)

    while len(a) > 0:
        c.append(a[0])
        # remove a[0] from a
        a.pop(0)

    while len(b) > 0:
        c.append(b[0])
        # remove a[0] from a
        b.pop(0)

    return c


# true test of speed
seed(1)
arr_length = 500
testArr = []
while len(testArr) < 500:
    testArr.append(randint(0, 5000))

print(testArr)
sortedArr = merge_sort(testArr)
print(sortedArr)
