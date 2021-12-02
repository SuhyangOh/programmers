function solution(strings, n) {
    strings.sort((a,b) => {return (a > b) - (a < b)});
    strings.sort((a,b) => {return (a[n] > b[n]) - (a[n] < b[n])});
    return strings;
}