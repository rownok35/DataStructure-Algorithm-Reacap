def selection_sort(arr):
    """
    Sorts a list of elements in ascending order using the selection sort algorithm.

    Time Complexity: O(n^2), where n is the number of elements in the list.
    This is due to the nested loops iterating through the list.

    Space Complexity: O(1), as sorting is done in-place and does not require extra space.

    Parameters:
    ----------
    arr : list
        A list of comparable elements to be sorted in ascending order.

    Returns:
    -------
    None
        The list is sorted in-place, and no value is returned.

    """

    n = len(arr)  

    for i in range(n - 1):
        # Assume the first element of the unsorted part is the smallest
        min_index = i

        # Find the index of the smallest element in the remaining unsorted part
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j

        # Swap the found minimum element with the first unsorted element if needed
        if min_index != i:
            arr[i], arr[min_index] = arr[min_index], arr[i]


if __name__ == "__main__":
    L = [5, 2, 3, 1, 4]
    print("Before sort:", L)
    selection_sort(L)
    print("After sort:", L)
