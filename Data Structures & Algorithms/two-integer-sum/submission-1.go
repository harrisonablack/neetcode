func twoSum(nums []int, target int) []int {
	var m = make(map[int]int)

	for i, v := range nums {
		m[v] = i
	}

	for i, v := range nums {
		var diff = target - v

		if j, ok := m[diff]; ok && j != i {
			return []int{i, j}
		}

	}

	return []int{}
}