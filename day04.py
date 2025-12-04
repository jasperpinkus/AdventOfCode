import copy


def solve(input_path):

    lines = input_path.open('r').read().strip().split("\n")

    part1 = 0
    part2 = 0
    matrix = [[bool(item == "@") for item in row] for row in lines]

    part1, part2 = again(matrix, part1, part2)
    return part1, part2

def again(matrix, part1, part2):
    new_matrix = copy.deepcopy(matrix)
    for x in range(len(matrix)):
        for y in range(len(matrix[x])):
            if not matrix[x][y]:
                new_matrix[x][y] = False
                continue
            adjacent_role = 0
            for i in [-1, 0, 1]:
                for j in [-1, 0, 1]:
                    if i == 0 and j == 0:
                        continue
                    a = x+i
                    b = y+j
                    if a < 0 or b < 0 or a >= len(matrix) or b >= len(matrix[0]):
                        continue
                    if matrix[a][b]:
                        adjacent_role += 1
            if adjacent_role < 4:
                new_matrix[x][y] = False
                part1 += 1
            else :
                new_matrix[x][y] = True
    if new_matrix == matrix:
        return part1, part2
    else:
        return again(new_matrix, part1, part2)


if __name__ == "__main__":
    from pathlib import Path
    from time import time
    start = time()
    part1, part2 = solve(Path(__file__).parent/"inputs"/"day04.txt")
    print(f"Part 1: {part1}\nPart 2: {part2}")
    print(f"Time Taken: {(time() - start)*1000:.2f} ms")