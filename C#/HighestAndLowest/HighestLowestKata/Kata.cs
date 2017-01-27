using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HighestLowestKata
{
    class Kata
    {
        public static string HighAndLow(string numbers)
        {
            string[] nums = numbers.Split(' ');
            int[] numbs = new int[nums.Length];

            for (int i = 0; i < nums.Length; i++)
            {
                numbs[i] = Int32.Parse(nums[i]);
            }

            Array.Sort(numbs);


            return (numbs[numbs.Length - 1] + " " + numbs[0]);
        }
    }
}
