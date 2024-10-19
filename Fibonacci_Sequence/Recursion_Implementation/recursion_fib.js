const sequence = [0, 1];
const seqLength = 18;

function fib(sequence, seqLength) {
  if (sequence.length >= seqLength) {
    return sequence;
  }
  const currSeqLength = sequence.length;
  sequence.push(
    parseInt(sequence[currSeqLength - 1]) +
      parseInt(sequence[currSeqLength - 2])
  );
  return fib(sequence, seqLength);
}

console.log(fib(sequence, seqLength));
