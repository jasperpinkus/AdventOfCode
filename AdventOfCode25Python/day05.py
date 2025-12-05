def solve(input_path):

    lines = input_path.open('r').read().strip().split("\n")
    lines.remove('')
    part1 = 0
    part2 = 0

    freshId = []
    avaiable = []

    for line in lines:
        if "-" in line:
            freshId.append(list(map(int,line.split("-"))))
        else:
            avaiable.append(int(line))
    avaiable.pop(0)
    
    for item in avaiable:
        for i in range(0, len(freshId)):
            if freshId[i][0] <= item and freshId[i][1] >= item:
                part1 += 1
                break

    freshId.sort()
    idx = 0
    while idx < len(freshId):
        if idx+1 == len(freshId):
            print(len(freshId))
            print(idx)
            break
        elif freshId[idx][1] >= freshId[idx+1][0]:
            if freshId[idx][1] >= freshId[idx+1][1]:
                freshId[idx+1] = freshId[idx]
            else: 
                freshId[idx+1][0] = freshId[idx][0]
            freshId.pop(idx)
        else:
            idx += 1
        
    for id in freshId:
        part2 += id[1]-id[0]
        part2 += 1

    return part1, part2

if __name__ == "__main__":
    from pathlib import Path
    from time import time
    start = time()
    part1, part2 = solve(Path(__file__).parent/"inputs"/"day05.txt")
    print(f"Part 1: {part1}\nPart 2: {part2}")
    print(f"Time Taken: {(time() - start)*1000:.2f} ms")