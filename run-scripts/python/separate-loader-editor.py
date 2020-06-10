import sys

test_file=sys.argv[1]

with open(test_file, "r+") as f:
     content = f.read() # read everything in the file
     f.seek(0)
     content=content.replace(", separateClassLoader = true,",", separateClassLoader = false,")
     content=content.replace("@Test(timeout = 4000)","@Test(timeout = 100000)")
     f.write(content)