function solution(nums) {
    let maxi = Math.floor(nums.length / 2)
    let ans = []
    for (let i = 0; i < nums.length; i++) {
        if (!ans.includes(nums[i])) {
            ans.push(nums[i])
        }
    }
    return Math.min(ans.length, maxi);
}