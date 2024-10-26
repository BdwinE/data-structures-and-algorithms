let list = [4, 25, 3, 65, 0];

function bubble_sort(list) {
  const length = list.length;
  let temp;
  console.log("List to bubble sort: ", list);
  for (let i = 0; i < length - 1; i++) {
    console.log("Iteration", i + 1);
    for (let j = 0; j < length - 1; j++) {
      if (list[j] > list[j + 1]) {
        temp = list[j];
        list[j] = list[j + 1];
        list[j + 1] = temp;
      }
      console.log("after loop", j + 1 + ":", list);
    }
  }
  console.log("FINAL RESULT: ", list);
}

bubble_sort([...list]);
