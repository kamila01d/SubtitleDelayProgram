# SubtitleDelayProgram

The program is used to delay or speed up the display of subtitles for movies in the MicroDVD format.

Dvd class contains delay(const char in, const char out,int delay, int fps) method, which delay (or accelerate)
subtitles by a specified number of milliseconds depending on the frame rate of the movie.
The program takes four arguments: input file path, output file path, and the number of milliseconds and framerate.
The delay method raises an exception when an unsupported sequence of characters appears in the file
