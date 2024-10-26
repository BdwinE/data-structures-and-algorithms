let list = [4, 3, 25, 65, 85];

function bubble_sort(list) {
  const length = list.length;
  let temp;
  let firstTwoSwapped; // stores whether first two elements were swapped
  let numOfSwaps;
  console.log("List to bubble sort: ", list);

  for (let i = 0; i < length - 1; i++) {
    console.log("Iteration", i + 1);
    firstTwoSwapped = false;
    numOfSwaps = 0;
    for (let j = 0; j < length - 1; j++) {
      if (list[j] > list[j + 1]) {
        temp = list[j];
        list[j] = list[j + 1];
        list[j + 1] = temp;
        numOfSwaps++;
        if (j === 0) firstTwoSwapped = true;
      }
      console.log("after loop", j + 1 + ":", list);
    }
    if (numOfSwaps === 0 || (numOfSwaps === 1 && firstTwoSwapped)) {
      console.log("Finished Early");
      break;
    }
  }
  console.log("FINAL RESULT: ", list);
}

bubble_sort([...list]);
