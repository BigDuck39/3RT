using System;

namespace _22._9._2021
{
    class Program
    {
        static string dvojniKompliment(string s)
        {
            char[] arr;

            arr = s.ToCharArray();
            for (int i=0;i<s.Length;i++)
            {
                if (arr[i] == '1')
                    arr[i] = '0';
                else
                    arr[i] = '1';
            }

            for (int j = s.Length-1; j >= 0; j--)
            {
                if (arr[j] == '0')
                {
                    arr[j] = '1';
                    break;
                }
                else
                {
                    arr[j] = '0';
                    continue;
                }
            }

            string result = new string(arr);

            return result;
        }

        static void Main(string[] args)
        {
            Console.WriteLine(dvojniKompliment(Console.ReadLine()));
        }
    }
}
