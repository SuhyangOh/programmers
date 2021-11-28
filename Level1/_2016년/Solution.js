function solution(a, b) {
    let date = new Date();
    date.setFullYear(2016);
    date.setMonth(a - 1);
    date.setDate(b);
    return date.toString().slice(0,3).toUpperCase()
}