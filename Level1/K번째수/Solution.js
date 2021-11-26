function solution(array, commands) {
    var answer = [];
    var arr = [];
    for (let i = 0; i < commands.length; i++) {
        arr = array.slice(commands[i][0] - 1, commands[i][1]);
        answer.push(arr.sort((a, b) => {
            return a - b;
          })[commands[i][2] - 1]);
    }
    return answer;
}