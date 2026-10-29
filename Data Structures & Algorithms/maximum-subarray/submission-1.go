func maxSubArray(nums []int) int {
	t := nums[0]
	m := nums[0]

	for _, v := range nums[1:] {
		t = int(math.Max(float64(v), float64((t + v))))
		m = int(math.Max(float64(m), float64(t)))
	}

	return m
}