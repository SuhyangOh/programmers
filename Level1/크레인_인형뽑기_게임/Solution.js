function solution(board, moves) {
    let answer = 0;
    let r = [];
    for (let i = 0; i < moves.length; i ++) {
        let floor = 0;
        while(board[floor][moves[i] - 1] === 0) {
            floor++
            if (floor === board.length - 1) {
            break;
            }
        }
        if (board[floor][moves[i] - 1] === 0) { break}
        r.push(board[floor][moves[i] - 1]);
        board[floor][moves[i] - 1] = 0;
        if (r.length >= 2) {
            const a = r.pop();
            const b = r.pop();
            if(a === b) {
               answer += 2
            } else {
                r.push(b);
                r.push(a);
            }
        }
    }
    return answer;
}