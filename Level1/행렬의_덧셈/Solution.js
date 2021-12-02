function solution(arr1, arr2) {
    const answer = arr1.map((num1, i) => {
        return num1.map((num2, j) => {
            return (num2 + arr2[i][j]);
        })
    })
    return answer;
}