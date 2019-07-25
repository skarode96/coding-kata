import {f} from '../src/functional';

describe('functional tests',()=>{
  it('should multiply arguments which are passed', function () {
      expect(f(2,3,(a,b)=> a*b)).toBe(6);
  });
  it('should add arguments which are passed', function () {
     expect(f(2,3,(a,b) => a+b)).toBe(5);
  });
});
