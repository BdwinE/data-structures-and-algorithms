const seqLength = 18;

function fib(n) {
  const sequence = [0, 1];
  for (let i = 2; i < n; i++) {
    sequence.push(parseInt(sequence[i - 1]) + parseInt(sequence[i - 2]));
  }
  return sequence;
}

console.log(fib(seqLength));
