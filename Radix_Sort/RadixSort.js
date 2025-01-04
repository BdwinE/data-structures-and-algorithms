radixSort();
function radixSort() {
  const buckets = [[], [], [], [], [], [], [], [], [], []];
  const list = ["04", "25", "03", "24", "31"];
  let mVDigit = list[0];
  for (let i = 1; i < list.length; i++) {
    // find max value in list
    if (list[i] > mVDigit) mVDigit = list[i].length;
  }

  for (let i = mVDigit - 1; i >= 0; i--) {
    while (list.length > 0) {
      const currValue = list.pop();
      const currIndex = currValue.charAt(i);
      buckets[+currIndex].push(currValue);
    }

    for (let j = 0; j < 10; j++) {
      while (buckets[j].length > 0) {
        list.push(buckets[j].pop());
      }
    }
  }

  console.log("Sorted List:");
  console.log(list);
}
