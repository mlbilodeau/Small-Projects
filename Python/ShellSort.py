from random import seed
from random import randint

"""
Implementation of Shell Sort
@:param arr
@:returns arr sorted using shell sort
"""


def shell_sort(arr):
    # using Knuth's formula get the interval
    h = 1

    while h < len(arr)/3:
        h = int(h*3+1)

    while h > 0:
        for outer in range(h, len(arr)):
            insertion_val = arr[outer]
            inner = outer

            while inner > h - 1 and arr[inner - h] >= insertion_val:
                arr[inner] = arr[inner - h]
                inner = inner - h

            arr[inner] = insertion_val
        h = int((h-1)/3)

    return arr


# test of speed
seed(1)
arr_length = 10
testArr = []
while len(testArr) < arr_length:
    testArr.append(randint(0, 5000))

print(testArr)
sortedArr = shell_sort(testArr)
print(sortedArr)
