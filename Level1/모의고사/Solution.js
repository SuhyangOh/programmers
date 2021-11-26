function solution(answers) {
    var answer = [];
    let one = 0;
    let two = 0;
    let three = 0;
    let answer1 = [1,2,3,4,5]
    let answer2 = [2,1,2,3,2,4,2,5]
    let answer3 = [3,3,1,1,2,2,4,4,5,5]
    for (let i = 0; i < answers.length; i ++) {
        if (answers[i] === answer1[i % 5]) {
            one++;
        }
        if (answers[i] === answer2[i % 8]) {
            two++;
        }
        if (answers[i] === answer3[i % 10]) {
            three++;
        }
    }
    let maxnum = Math.max(one, two, three)
    if (one === maxnum) {
        answer.push(1)
    }
    if (two === maxnum) {
        answer.push(2)
    }
    if (three === maxnum) {
        answer.push(3)
    }
    return answer;
}