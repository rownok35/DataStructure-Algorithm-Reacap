from typing import List

def binary_search(L: List[int], x: int) -> int:
    low, high = 0, len(L) - 1
    
    # Binary search loop
    while low <= high:
        mid = (low + high) // 2  # Integer division
        
        if L[mid] == x:
            return mid  # Found x at position mid
        elif L[mid] < x:
            low = mid + 1  # Search in the right half
        else:
            high = mid - 1  # Search in the left half
    
    return -1  # x not found in L


if __name__ == "__main__":
    L = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    for x in range(1, len(L)):
        position = binary_search(L, x)
        
        if position == -1:
            print(f"{x} not found in the list.")
        else:
            print(f"{x} found at position {position}.")
    
    print("Program terminated")
