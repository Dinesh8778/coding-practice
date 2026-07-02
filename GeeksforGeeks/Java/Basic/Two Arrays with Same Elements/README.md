# 📝 Two Arrays with Same Elements (GeeksforGeeks)

🔗 [Problem Link](https://www.geeksforgeeks.org/problems/the-problem-of-identical-arrays3229/1)

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-brightgreen) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
GFG Problem

### 🚀 Performance
- **Runtime:** Successfully Evaluated
- **Memory:** N/A

---

### 📜 Problem Description
<p><span style="font-size: 18px;">Check whether given two arrays <strong>a[]</strong>&nbsp;and <strong>b[] </strong>are identical or not. Two arrays are called identical arrays if they contain the same element with the same count, regardless of the order of elements.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> a[] = [1, 2, 3, 4, 5], b[] = [3, 4, 1, 2, 5]
<strong>Output:</strong> true
<strong>Explanation: </strong>Here we can see array a[] = [1, 2, 3, 4, 5] and b[] = [3, 4, 1, 2, 5]. If we look both the array then we can get that array b[] is the permutation of a[]. So, both array.are identical. </span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> a[] = [1, 2, 4], b[] = [3, 2, 1]
<strong>Output:</strong> false
<strong>Explanation: </strong>Here we can see that, missing 4 in array b and has 3 so they are not identical.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ a.size(), b.size() ≤ 10<sup>5<br></sup>a.size() = b.size()<br>1 ≤ a[i], b[i] ≤ 10<sup>5</sup></span></p>