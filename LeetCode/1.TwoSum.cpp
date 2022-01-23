//1st approach
//time complexity: O(n^2)
//space complexity: O(1)
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> vect;
        
        for(int i = 0; i < nums.size() - 1; i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if(nums[i] + nums[j] == target) {
                    vect.push_back(i);
                    vect.push_back(j);
                }
            }
        }
        
        return vect;
    }
};


//2nd approach
//time complexity: O(n)
//space complexity: O(n)
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target)  {
        unordered_map<int, int> m;
        vector<int> vec;
        
        for(int i = 0; i < nums.size(); ++i) {
            int comp = target - nums[i];
            
            if(m.find(comp) == m.end()) {
               m[nums[i]] = i;
            } else {
                vec.push_back(i); vec.push_back(m[comp]);
            }
        }
        
        return vec;
    }
};
