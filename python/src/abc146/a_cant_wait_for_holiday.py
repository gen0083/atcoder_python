def do_code():
    s = input()
    weekday = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
    weekday.reverse()
    i = weekday.index(s)
    print((i + 1) % 8)


if __name__ == "__main__":
    do_code()
