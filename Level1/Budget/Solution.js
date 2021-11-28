function solution(d, budget) {
    var answer = 0;
    d.sort(function s(a,b) {
        return a - b;
    })
    let i = 0;
    while ((budget - d[i]) >= 0 && i < d.length) {
        budget -= d[i];
        i++
        answer++;
    }
    return answer;

}