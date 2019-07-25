import multiply from '../src/curry-functions';

describe('test curry functions', function () {
  it('should multiply 3 numbers', function () {
    expect(multiply(2)(3)(4)).toEqual(24);
  });
  
  it('should multiply 4 numbers', function () {
    expect(multiply(2)(2)(2)).toEqual(8);
  });
});